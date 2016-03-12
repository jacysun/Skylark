function check() {


}

function checkReturn() {
  if (document.getElementById('roundTrip').checked) {
  	document.getElementById('return').setAttribute('required', true);
  }
  else {
  	document.getElementById('return').removeAttribute('required');
  }
}
