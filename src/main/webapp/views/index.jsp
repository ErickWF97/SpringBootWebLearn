<%@page language="java" %>

<html>
    <head>
        <link rel="stylesheet" type="text/css" href="style.css">
        <title>Login</title>
         <style>
                #snackbar {
                    visibility: hidden;
                    min-width: 250px;
                    background-color: #f44336;
                    color: #fff;
                    text-align: center;
                    border-radius: 4px;
                    padding: 16px;
                    position: fixed;
                    z-index: 1;
                    bottom: 30px;
                    left: 50%;
                    transform: translateX(-50%);
                    font-size: 17px;
                }

                #snackbar.show {
                    visibility: visible;
                    animation: fadeInOut 3s ease-in-out;
                }

                @keyframes fadeInOut {
                    0%, 100% { opacity: 0; }
                    10%, 90% { opacity: 1; }
                }
            </style>
    </head>
    <body>
        <h2>Hello User</h2>

        <form action="login">
           <label for="login">user</label>
           <input type="text" id=num1" name="login"><br>
           <label for="password">password</label>
           <input type="text" id="num2" name="password"><br>
           <input type="submit" value="Submit">
        </form>

        <div id="snackbar">${errorLogin}</div>

         <script>
                window.onload = function() {
                    const snackbar = document.getElementById("snackbar");
                    if (snackbar.textContent.trim() !== "") {
                        snackbar.className = "show";
                        setTimeout(() => { snackbar.className = snackbar.className.replace("show", ""); }, 3000);
                    }
                }
            </script>

    </body>
</html>