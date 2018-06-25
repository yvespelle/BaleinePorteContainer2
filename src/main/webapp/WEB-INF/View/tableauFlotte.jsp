<%-- 
    Document   : tableauEmployes
    Created on : 19 juin 2018, 14:13:55
    Author     : Rive Droite
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>

        <div class="container" >
            <div class="row col-md-6 col-md-offset-0 custyle">

                <form method="post" action="Controleur" name="suppression">
                    <table class="table table-striped custab">

                        <!--permet de faire disparaitre entrée du tableau s'il n'y a plus d'employé-->
                        <c:if test="${!empty cleListeEmployes}">
                            <thead>
                            <h1>Liste des employés</h1>
                            <tr class="text-center">
                                <th>Sél</th>
                                <th>NOM</th>
                                <th>LONGUEUR</th>
                                <th>LARGEUR</th>
                                <th>PORT D'ATTACHE</th>
                                <th>CAPACITE</th>
                                <th>VITESSE</th>
                                <th>LONGITUDE</th>
                                <th>LATITUDE</th>
                                <th>NOMBRE DE CONTAINERS</th>
                            </tr>
                            </thead>
                            <c:forEach items="${cleListeEmployes}" var="employe">
                                <tr>
                                    <td><input type="radio" name="idEmploye" value="${employe.id}" CHECKED></td>
                                    <td>${employe.nom}</td>
                                    <td>${employe.longueur}</td>
                                    <td>${employe.largeur}</td>
                                    <td>${employe.portattache}</td>
                                    <td>${employe.capacite}</td>
                                    <td>${employe.vitesse}</td>
                                    <td>${employe.longitude}</td>
                                    <td>${employe.latitude}</td>
                                    <td>${employe.nbrContainer}</td>
                                </tr>                         
                            </c:forEach>
                    </table>
                    <button type="submit" name="action" value="VoirDetails" class="btn btn-primary">Details</button>
                    <button type="submit" name="action" value="ActionSupprimer" class="btn btn-primary">Supprimer</button>
                    <button type="submit" name="action" value="VoirAjouter" class="btn btn-primary">Ajouter</button>
                    <button type="submit" name="action" value="VoirEmployes" class="btn btn-primary">Voir les Employes</button>
                    <button type="submit" name="action" value="VoirClients" class="btn btn-primary">Voir les Clients</button>
                    <button type="submit" name="action" value="VoirChargements" class="btn btn-primary">Voir les marchandises</button>
                    <button type="submit" name="action" value="Quitter" class="btn btn-warning">Quitter</button>
                </form>
            </div>
        </div>         
    </body>
</html>
