const pinCodeRegex = /^[1-9][0-9]{5}$/;

const pinCode = "400088";

if (pinCodeRegex.test(pinCode)) {
  console.log("Valid PIN code");
} 
else {
  console.log("Invalid PIN code");
}