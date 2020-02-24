

function soNguyenTo(){
    let number = document.getElementById('ipNumber').value;
    if (number === "" ){
        document.getElementById('result').innerHTML = "";
    } else {
        if (number <= 1) {
            document.getElementById('result').innerHTML = number +' Khong phai la so nguyen to';
        } else {
            let count = 0;
            for ( let i=2 ; i <= Math.sqrt(number) ; i++) {

                if ( number % i === 0) {
                    count += 1;
                    break;
                }

            }
            if (count !== 0) {
                document.getElementById('result').innerHTML = number +' Khong phai la so nguyen to';
            } else {
                document.getElementById('result').innerHTML =number +' La so nguyen to';
            }
        }
    }

}


