//  document.getElementById("cal").textContent="My own Calculator";


function cal() {
    var op1 = document.getElementById("one").value;
    var op2 = document.getElementById("second").value;
    op1 = parseInt(op1);
    op2 = parseInt(op2);
    var op3 = document.getElementById("opr").value;
    var res = 0;
    switch (op3) {
      case "+":
        res = op1 + op2;
        break;
      case "-":
        res = op1 - op2;
        break;
      case "*":
        res = op1 * op2;
        break;
      case "/":
        res = op1 / op2;
        break;
      default:
    }
    document.getElementById("res").value = res;
  }