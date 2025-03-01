<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://accounts.google.com/gsi/client" async defer></script>
<script src="https://unpkg.com/jwt-decode/build/jwt-decode.js"></script>
<script>
function handleCredentialResponse(response) {
    //console.log("Encoded JWT ID token: " + response.credential);
    var responsePayload = jwt_decode(response.credential);
    //console.log(responsePayload);

    //console.log("ID: " + responsePayload.sub);
    console.log('Full Name: ' + responsePayload.name);
    //console.log('Given Name: ' + responsePayload.given_name);
    //console.log('Family Name: ' + responsePayload.family_name);
    console.log("Image URL: " + responsePayload.picture);
    console.log("Email: " + responsePayload.email);    
    
}
window.onload = function () {
    google.accounts.id.initialize({
        client_id: "483732575840-q4af0ir4dg874j38mk9lahejolgf9eo7.apps.googleusercontent.com",
        callback: handleCredentialResponse
    });
    google.accounts.id.renderButton(
        document.getElementById("buttonDiv"),
        { theme: "outline", size: "large" }  // customization attributes
    );
    google.accounts.id.prompt(); // also display the One Tap dialog
}
	
</script>
<div id="buttonDiv"></div>
</head>
<body>


    <div id="buttonDiv"></div> 
    
</body>
</html>
