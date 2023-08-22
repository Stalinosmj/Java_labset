public class Bank_interest {
    int getRateOfInterest() {
        return 0;
    }
}
// create child classes

class SBI extends Bank_interest {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank_interest {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank_interest {
    int getRateOfInterest() {
        return 9;
    }
}
