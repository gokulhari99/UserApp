function ValidateEmail(inputText) {
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
  if (inputText.value.match(mailformat)) {
    let emailId = inputText.value;
    getUserDetails(emailId);
    console.log(inputText.value);
  } else {
    alert("You have entered an invalid email address!");
    document.form1.text1.focus();
    return false;
  }
}
function getUserDetails(emailId) {
  var settings = {
    url: `http://localhost:8080/user/getUser/${emailId}`,
    method: "GET",
    timeout: 0,
  };
  console.log(settings);
  $.ajax(settings).done(function (response) {
    console.log(response);
    let result = response;
    let options = "";
    for (const [key, value] of Object.entries(result)) {
      options += `<tr>
    <td>${key}</td>
    <td>${value}</td>
  </tr>`;
    }
    $("#table-body").append(options);
    $(".mail").hide();
    $(".userdetails").show();
  });
}
function getBack() {
  $("#text-value").val("");
  $(".userdetails").hide();
  $(".mail").show();
}
