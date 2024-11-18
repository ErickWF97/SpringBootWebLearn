<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <style>
                table {
                    width: 80%;
                    border-collapse: collapse;
                    margin: 20px auto;
                }

                th, td {
                    border: 1px solid #ddd;
                    padding: 8px;
                    text-align: left;
                }

                th {
                    background-color: #f4f4f4;
                }

                tr:nth-child(even) {
                    background-color: #f9f9f9;
                }

                tr:hover {
                    background-color: #f1f1f1;
                }

                h1 {
                    text-align: center;
                }
            </style>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nome</th>
                        <th>Email</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${listUsers}" var="user" >
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.email}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </body>
</html>