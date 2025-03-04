const emailRegex = RegExp("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-z]{2,3}([.][a-z]{2})*$");

const email = "abc.xyz@bridgelabz.co.in";

if (emailRegex.test(email)) {
  console.log("Valid Email");
} 
else {
  console.log("Invalid Email");
}