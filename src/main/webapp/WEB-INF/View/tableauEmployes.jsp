<%-- 
    Document   : tableauEmployes
    Created on : 19 juin 2018, 14:13:55
    Author     : Groupe Rouge
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
                            <thead>
                            <h1>Liste des employés</h1>
                            <tr class="text-center">
                                <th>Sél</th>
                                <th>NOM</th>
                                <th>PRENOM</th>
                                <th>TEL DOMICILE</th>
                                <th>TEL PORTABLE</th>
                                <th>TEL PRO</th>
                                <th>ADRESSE</th>
                                <th>CODE POSTAL</th>
                                <th>VILLE</th>
                                <th>EMAIL</th>
                            </tr>
                            </thead>
                            <c:forEach items="${cleListeEmployes}" var="employe">
                                <tr>
                                    <td><input type="radio" name="idEmploye" value="${employe.id}" CHECKED></td>
                                    <td>${employe.nom}</td>
                                    <td>${employe.prenom}</td>
                                    <td>${employe.teldom}</td>
                                    <td>${employe.telport}</td>
                                    <td>${employe.telpro}</td>
                                    <td>${employe.adresse}</td>
                                    <td>${employe.codepostal}</td>
                                    <td>${employe.ville}</td>
                                    <td>${employe.email}</td>
                                </tr>                         
                            </c:forEach>
                    </table>
                    <button type="submit" name="action" value="VoirDetails" class="btn btn-primary">Details</button>
                    <button type="submit" name="action" value="ActionSupprimer" class="btn btn-primary">Supprimer</button>
                    <button type="submit" name="action" value="VoirAjouter" class="btn btn-primary">Ajouter</button>
                    <button type="submit" name="action" value="VoirFlotte" class="btn btn-primary">Voir la flotte</button>
                    <button type="submit" name="action" value="VoirClients" class="btn btn-primary">Voir les Clients</button>
                    <button type="submit" name="action" value="VoirChargements" class="btn btn-primary">Voir les marchandises</button>
                    <button type="submit" name="action" value="Quitter" class="btn btn-warning">Quitter</button>
                </form>
            </div>
        </div>         
    </body>
</html>
