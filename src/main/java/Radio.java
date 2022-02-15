public class Radio {


    private int currentVolume;
    private int currentStation;
    private int amountStation = 10;


    public Radio(int amountStation) {
        amountStation = amountStation;
    }

    public Radio() {

    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation >= 0) {
            if (currentStation < (amountStation)) {
                this.currentStation = currentStation;
            }

        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume >= 0) {
            if (currentVolume <= 100) {
                this.currentVolume = currentVolume;
            }

        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            return;
        }
    }

    public void next() {
        if (currentStation == (amountStation-1)) {
            this.currentStation = 0;
        }
        else {
            this.currentStation = this.currentStation + 1;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            this.currentStation = amountStation;
        } else {
            this.currentStation = this.currentStation - 1;
        }

    }

}