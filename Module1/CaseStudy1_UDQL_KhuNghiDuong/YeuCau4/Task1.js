function addNewCustomer() {
    let number = parseInt(prompt('Nhap vao so luong ten khach hang: '));
    let arrNameCustomer = new Array();
    if ( number < 1 ) {
        alert('Vui long nhap so luong lon hon 1!!');
        number = parseInt(prompt('Nhap vao so luong ten khach hang: '));
    } else {
        for ( let i = 0 ; i < number ; i++) {
            arrNameCustomer[i] = prompt('Ten khach hang thu ' + (i + 1));
        }
        arrNameCustomer.sort();
        for ( let i = 0 ; i < number ; i++) {
            let textDisplay = document.createElement("p");
            textDisplay.innerText = arrNameCustomer[i];
            document.getElementById("result").appendChild(textDisplay);
        }
    }

}