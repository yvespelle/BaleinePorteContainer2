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
                                <th>NUMERO</th>
                                <th>BATEAU</th>
                                <th>DEPART</th>
                                <th>DESTINATION</th>
                                <th>CLIENT</th>
                                <th>POIDS</th>

                            </tr>
                            </thead>
                            <c:forEach items="${cleListeEmployes}" var="employe">
                                <tr>
                                    <td><input type="radio" name="idEmploye" value="${employe.id}" CHECKED></td>
                                    <td>${employe.numero}</td>
                                    <td>${employe.bateau}</td>
                                    <td>${employe.depart}</td>
                                    <td>${employe.destination}</td>
                                    <td>${employe.client}</td>
                                    <td>${employe.poids}</td>
                                </tr>                         
                            </c:forEach>
                    </table>
                    <button type="submit" name="action" value="VoirDetails" class="btn btn-primary">Details</button>
                    <button type="submit" name="action" value="ActionSupprimer" class="btn btn-primary">Supprimer</button>
                    <button type="submit" name="action" value="VoirAjouter" class="btn btn-primary">Ajouter</button>
                    <button type="submit" name="action" value="VoirEmployes" class="btn btn-primary">Voir les Employes</button>
                    <button type="submit" name="action" value="VoirClients" class="btn btn-primary">Voir les Clients</button>
                    <button type="submit" name="action" value="VoirFlotte" class="btn btn-primary">Voir la Flotte</button>
                    <button type="submit" name="action" value="Quitter" class="btn btn-warning">Quitter</button>
                </form>
            </div>
        </div>         
    </body>
</html>
