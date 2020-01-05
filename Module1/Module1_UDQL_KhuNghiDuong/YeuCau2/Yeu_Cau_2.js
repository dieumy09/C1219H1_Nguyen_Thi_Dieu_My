let name = 'Nguyen Thi Dieu My';
let customer = '10' ;
let idNumber = 206117991;
let quantity = 1 ;
let email = 'nguyenthidieumysph@gmail.com';
let rentdays = 3;
let address = 'Da Nang';
let service = '300';
let birthday = '1997-09-09'
let rfr = '1';
let sale = 0;
function caculatec() {
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

}


function show() {
    caculatec();
    document.getElementById('name').innerText = name ;
    document.getElementById('customer').value = customer ;
    document.getElementById("sale").innerText = sale ;
    document.getElementById("id").innerText = idNumber ;
    document.getElementById("quantity").innerText = quantity ;
    document.getElementById("email").innerText = email ;
    document.getElementById("rentdays").innerText = rentdays ;
    document.getElementById("address").innerText = address ;
    document.getElementById("service").value = service ;
    document.getElementById("birthday").innerText = birthday ;
    document.getElementById("roomforrent").value = rfr;
    document.getElementById("tbShow").style.display = 'inline';
}

function edit() {
    document.getElementById('save').style.display = 'inline';
    caculatec();
    document.getElementById('name').style.display = 'none' ;
    document.getElementById('ipName').style.display = 'inline' ;
    document.getElementById('ipName').value = name ;
    document.getElementById('customer').disabled = false ;
    document.getElementById("sale").style.display = 'none' ;
    document.getElementById("ipSale").style.display = 'inline' ;
    document.getElementById("id").style.display = 'none' ;
    document.getElementById("ipID").style.display = 'inline' ;
    document.getElementById("ipID").value = idNumber ;
    document.getElementById("quantity").style.display = 'none' ;
    document.getElementById("ipQuantity").style.display = 'inline' ;
    document.getElementById("ipQuantity").value =  quantity ;
    document.getElementById("email").style.display = 'none' ;
    document.getElementById("ipEmail").style.display = 'inline' ;
    document.getElementById("ipEmail").value = email ;
    document.getElementById("rentdays").style.display = 'none' ;
    document.getElementById("ipRentdays").style.display = 'inline' ;
    document.getElementById("ipRentdays").value = rentdays ;
    document.getElementById("address").style.display = 'none' ;
    document.getElementById("ipAddress").style.display = 'inline' ;
    document.getElementById("ipAddress").value = address ;
    document.getElementById("service").disabled = false ;
    document.getElementById("birthday").style.display = 'none' ;
    document.getElementById("ipBirthday").style.display = 'inline' ;
    document.getElementById("ipBirthday").value = birthday ;
    document.getElementById("roomforrent").disabled = false;
    document.getElementById("tbShow").style.display = 'inline';

}

function saveEd() {
    name = document.getElementById('ipName').value;
    customer = document.getElementById('customer').value;
    sale = document.getElementById("ipSale").value;
    idNumber = document.getElementById("ipID").value;
    quantity = document.getElementById("ipQuantity").value;
    email = document.getElementById("ipEmail").value;
    rentdays = document.getElementById("ipRentdays").value;
    address = document.getElementById("ipAddress").value;
    service = document.getElementById("service").value;
    birthday = document.getElementById("ipBirthday").value;
    rfr = document.getElementById("roomforrent").value;
    show();
    document.getElementById('name').style.display = 'inline' ;
    document.getElementById('ipName').style.display = 'none' ;
    document.getElementById('customer').disabled = true ;
    document.getElementById("sale").style.display = 'inline' ;
    document.getElementById("ipSale").style.display = 'none' ;
    document.getElementById("id").style.display = 'inline' ;
    document.getElementById("ipID").style.display = 'none' ;
    document.getElementById("quantity").style.display = 'inline' ;
    document.getElementById("ipQuantity").style.display = 'none' ;
    document.getElementById("email").style.display = 'inline' ;
    document.getElementById("ipEmail").style.display = 'none' ;
    document.getElementById("rentdays").style.display = 'inline' ;
    document.getElementById("ipRentdays").style.display = 'none' ;
    document.getElementById("address").style.display = 'inline' ;
    document.getElementById("ipAddress").style.display = 'none' ;
    document.getElementById("service").disabled = true ;
    document.getElementById("birthday").style.display = 'inline' ;
    document.getElementById("ipBirthday").style.display = 'none' ;
    document.getElementById("roomforrent").disabled = true;
    document.getElementById("tbShow").style.display = 'block';
}

function price() {
    let currentYear = new Date().getFullYear();
    console.log(new Date().getFullYear())
    let birthdayYear = new Date(birthday).getFullYear();
    console.log(new Date(birthday).getFullYear());
    let age = currentYear - birthdayYear;


    let saleByage = 0;
    if ( age >30 && address == 'Da Nang') {
        saleByage = 2;
    }
    if ( age >= 20 && age <=30 && address == 'Da Nang') {
        saleByage =1 ;
    }
    console.log(saleByage);

    let saleByday = 0;
    if ( rentdays > 7)  {
        saleByday = 30;
    } else if ( rentdays >= 5 && rentdays <= 7) {
        saleByday = 20 ;
    } else if ( rentdays >= 2 && rentdays <=4 ) {
        saleByday = 10 ;
    } else {
        saleByday = 0 ;
    }
    console.log(saleByday)
    console.log(sale);
    let allSale = sale + saleByage + saleByday + parseInt(customer);
    console.log(parseInt(customer))
    console.log(sale + saleByage + saleByday + parseInt(customer));

    let price = parseInt(service) * parseInt(rentdays) * ( 1 - allSale/100);
    document.getElementById('output').innerText = 'PRICE: ' + Math.round(price*1000)/1000 + ' $'  ;

}
