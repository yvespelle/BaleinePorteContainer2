<%-- 
    Document   : choix
    Created on : 19 juin 2018, 14:13:52
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
    <title>JSP Page</title>
</head>
<body> 
    <form action="Controleur" method="post">
        Bonjour ${identifiants.login} ! <br /><br />
        Choisissez votre action : <br /><br />

        <button type="submit" name="action" value="VoirEmployes" class="btn btn-primary">Consulter les employés</button>
        <button type="submit" name="action" value="VoirFlotte" class="btn btn-primary">Consulter la flotte</button>
        <button type="submit" name="action" value="VoirClients" class="btn btn-primary">Consulter les clients</button>
        <button type="submit" name="action" value="VoirChargements" class="btn btn-primary">Consulter les chargements</button>
        <button type="submit" name="action" value="Quitter" class="btn btn-warning">Quitter</button>

    </form>
</body>
</html>
