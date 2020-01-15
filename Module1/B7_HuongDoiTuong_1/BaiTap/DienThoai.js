let Mobile = function (phone,status,pin,typingMessenger,receiveMessenger,sentMessenger) {

    this.setPhone = function (phone) {
        this.phone = phone;
    };
    this.setStatus = function (status) {
        this.status = status ;
    };
    this.setPin = function (pin) {
        this.pin = pin;

    };
    this.setTypingMessenger = function (typingMessenger) {
        this.typingMessenger = typingMessenger;

    };
    this.setReceiveMessenger = function (receiveMessenger) {
        this.receiveMessenger = receiveMessenger;

    };
    this.setSentMessenger = function (sentMessenger) {
        console.log(this.getPhone());
        this.sentMessenger = sentMessenger;

    };
    this.getPhone = function () {
        return this.phone;

    };
    this.getStatus = function () {
        return this.status;

    };
    this.getPin = function () {
        return pin;

    };
    this.getTypingMessenger = function () {
        return typingMessenger;

    };
    this.getReceiveMessenger = function () {
        return receiveMessenger;

    };
    this.getSentMessenger = function () {
        return this.sentMessenger;

    };
    this.checkStatus = function () {
        if ( this.getStatus() === true ) {
            alert('Dt dang bat')
        }

    };

    this.sendMessageTo = function (mobile) {
        mobile.setSentMessenger(this.getTypingMessenger());
    };
};

let android = new Mobile('android',true,100,'aaaaaaa','bbbbbbb','cccc');
let iPhone = new Mobile('iPhone',true,100,'gggg','hhhhh','');

android.sendMessageTo(iPhone);
iPhone.setSentMessenger('ngu nhu bo');
alert(iPhone.getSentMessenger());