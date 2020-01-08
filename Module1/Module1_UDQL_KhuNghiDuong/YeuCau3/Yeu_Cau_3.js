let NUMBER_My = '1234567890-=+[]{};:.,>"~`';
let NUMBER3 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ;abcdefghijklmnopqrstuvwxyz-=+[]{};:.,>"~`';

function btCheck() {
    checkEmail();
    checkDate();
    checkName();
    checkID();
    checkAddress();
    checkRentdays();
    checkQuantity();
    caculatec();
}

function checkName() {
    let name = document.getElementById('ipName');
    let checkName1 = 0;
    if (name.value.length === 0) {
        name.value = "";
        document.getElementById('errorName').style.display = 'inline';
        document.getElementById('errorName').innerText = 'Error!!!';
    } else {
        while (checkName1 != name.value.length) {
            for (let i = 0; i <= (name.value.length) - 1; i++) {
                if (NUMBER_My.indexOf(name.value.charAt(i)) !== -1) {
                    name.value = "";
                    document.getElementById('errorName').style.display = 'inline';
                    document.getElementById('errorName').innerText = 'Error!!!';
                    checkName1 = 0;
                    break;
                } else {
                    document.getElementById('errorName').style.display = 'none';
                    (checkName1 = checkName1 + 1)
                }
            }
        }
    }


    let fixName = "";
    name.value=name.value.toLocaleLowerCase();
    for (let i = 0; i < name.value.length; i++) {
        if (name.value.charAt(i) === " " && name.value.charAt(i + 1) === " ") {
            continue;
        }
        if (i === 0 || name.value.charAt(i - 1) === " ") {
            fixName += name.value.charAt(i).toLocaleUpperCase();
            continue;
        }
        fixName += name.value.charAt(i)
    }
    name.value = fixName;

}


function checkID() {
    let idCard = document.getElementById('ipID');
    let checkID = 0;
    // console.log(idCard.value.length);
    if (idCard.value.length === 0) {
        idCard.value = "";
        document.getElementById('errorID').style.display = 'inline';
        document.getElementById('errorID').innerText = 'Error!!!';
    } else {
        while (checkID !== idCard.value.length) {
            if (idCard.value.length !== 9) {
                idCard.value = "";
                document.getElementById('errorID').style.display = 'inline';
                document.getElementById('errorID').innerText = 'Error!!!';
            } else {
                for (let j = 0; j <= (idCard.value.length) - 1; j++) {
                    if (NUMBER3.indexOf(idCard.value.charAt(j)) !== -1) {
                        idCard.value = "";
                        document.getElementById('errorID').style.display = 'inline';
                        document.getElementById('errorID').innerText = 'Error!!!';
                        checkID = 0;
                        break;
                    } else {
                        document.getElementById('errorID').style.display = 'none';
                        checkID = checkID + 1;
                    }
                }
            }
        }

    }
    }

function checkAddress() {
    let address = document.getElementById('ipAddress').value;
    if (address.length === 0) {
        address.value = "";
        document.getElementById('errorAddress').style.display = 'inline';
        document.getElementById('errorAddress').innerText = 'Error!!!';
    }

}

function checkRentdays() {
    let rentDays = document.getElementById('ipRentdays').value;
    let checkRentDays = 0;
    if (rentDays.length === 0) {
        rentDays = "";
        document.getElementById('errorRentdays').style.display = 'inline';
        document.getElementById('errorRentdays').innerText = 'Error!!!';
    } else {
        while (checkRentDays !== rentDays.length) {
            for (let i = 0; i < (rentDays.length) - 1; i++) {
                if (NUMBER3.indexOf(rentDays.charAt(i)) !== -1) {
                    rentDays = "";
                    document.getElementById('errorRentdays').style.display = 'inline';
                    document.getElementById('errorRentdays').innerText = 'Error!!!';
                    checkRentDays = 0;
                    break;
                } else {
                    document.getElementById('errorRentdays').style.display = 'none';
                    checkRentDays = checkRentDays + 1;
                    break;
                }
            }
        }

    }
    }

function checkQuantity() {
    let quantity = document.getElementById('ipRentdays').value;
    let checkQuantity = 0;
    if (quantity.length === 0) {
        quantity = "";
        document.getElementById('errorQuantity').style.display = 'inline';
        document.getElementById('errorQuantity').innerText = 'Error!!!';
    } else {
        while (checkQuantity !== quantity.length) {
            for (let i = 0; i < (quantity.length) - 1; i++) {
                if (NUMBER3.indexOf(quantity.charAt(i)) !== -1) {
                    quantity = "";
                    document.getElementById('errorQuantity').style.display = 'inline';
                    document.getElementById('errorQuantity').innerText = 'Error!!!';
                    checkQuantity = 0;
                    break;
                } else {
                    document.getElementById('errorQuantity').style.display = 'none';
                    checkQuantity = checkQuantity + 1;
                    break;
                }
            }
        }

    }

}
    
function checkEmail() {
    let regex = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    let email = document.getElementById('ipEmail');
    if (regex.test(email.value)) {
        document.getElementById('errorEmail').style.display = 'none';
    } else {
        email.value = "";
        document.getElementById('errorEmail').style.display = 'inline';
        document.getElementById('errorEmail').innerText = 'Error!!!'
    }

}


function isDate(strDate) {
    let comp = strDate.split('/');
    let d = parseInt(comp[0], 10);
    let m = parseInt(comp[1], 10);
    let y = parseInt(comp[2], 10);
    let date = new Date(y,m-1,d);
    if (date.getFullYear() == y && date.getMonth() + 1 == m && date.getDate() == d) {
        return true
    }
    return false
}
function checkDate() {
    let date = document.getElementById('ipBirthday');
    if (isDate(date.value)) {
        document.getElementById('errorBirthday').style.display = 'none';
    } else {
        date.value = "";
        document.getElementById('errorBirthday').style.display = 'inline';
        document.getElementById('errorBirthday').innerText = 'Error!!!'
    }

}

function caculatec() {
    let address = document.getElementById('ipAddress').value;
    let sale = 0;
    switch (address) {
        case "Da Nang":
            sale = 20;
            break;
        case "Quang Nam":
            sale = 5 ;
            break;
        case "Hue":
            sale = 10 ;
            break;
        default :
            sale = 0;
    }
document.getElementById('ipSale').value = sale ;
}
