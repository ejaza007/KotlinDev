open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"

    open fun turnOn(){
        deviceStatus = "on"
    }

    open fun turnOff(){
        deviceStatus = "off"
    }
}

