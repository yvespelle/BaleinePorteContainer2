/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ctrl;

import com.employes.utils.EmployesConstantes;
import com.modele.Employes;
import com.modele.Utilisateurs;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author esic
 */
public class Controleur extends HttpServlet {

    @EJB
    private GestionDB gestionDB;

   ArrayList<Employes> listeEmployes = new ArrayList<>();
    ArrayList<Utilisateurs> listeUtilisateurs = new ArrayList<>();
    Employes employe = new Employes();
    Utilisateurs utilisateurs = new Utilisateurs();
    String idEmploye = EmployesConstantes.FRM_ID_EMPL_SELECT;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        String loginForm = request.getParameter(EmployesConstantes.FRM_LOGIN);
        String mdpForm = request.getParameter(EmployesConstantes.FRM_MDP);
        String action = request.getParameter(EmployesConstantes.ACTION);

        if (action == null) {
            request.getRequestDispatcher(EmployesConstantes.PAGE_INDEX).forward(request, response);

        } else if (action != null) {

            switch (action) {

                case EmployesConstantes.ACTION_LOGIN:
                    //Si le nom d'utilisateur et le mot de passe sont vide, renvoyer vers l'index avec un message d'erreur.
                    if (loginForm != null && mdpForm != null) {

                        if (loginForm.isEmpty() || mdpForm.isEmpty()) {
                            request.setAttribute("cleMessageErreur", EmployesConstantes.ERREUR_SAISIE_VIDE);
                            request.getRequestDispatcher(EmployesConstantes.PAGE_INDEX).forward(request, response);
                        } else {
                            listeUtilisateurs.addAll(gestionDB.getUtilisateurs());

                            for (Utilisateurs i : listeUtilisateurs) {

                                if (i.getLogin().equals(loginForm) && i.getMdp().equals(mdpForm)) {
                                    utilisateurs.setLogin(request.getParameter(EmployesConstantes.FRM_LOGIN));
                                    session.setAttribute("utilisateurs", utilisateurs);
                                    request.getRequestDispatcher(EmployesConstantes.PAGE_ACCUEIL).forward(request, response);

                                }
                            }

                            request.setAttribute("cleMessageErreur", EmployesConstantes.ERREUR_INFOS_CONN_KO);
                            request.getRequestDispatcher(EmployesConstantes.PAGE_INDEX).forward(request, response);
                        }
                    }
                    break;
            }
        }
    }


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
