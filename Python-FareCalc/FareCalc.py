rates={
    "Economy":10,
    "Premium":18,
    "SUV":25
}

def calculate_fare(km,type,hour):

    if type not in rates:
        print("Service Not Available")
        return None

    total=km*rates[type]

    if 17 <= hour <= 20:
        total=total * 1.5

    return total


try:
    km = float(input("enter distance in km :"))
    type = input("enter vehicle type :")
    hour = int(input("enter hours :"))

    fare = calculate_fare(km,type,hour)

    if fare is not None:
        print("Price Receipt")
        print("distance travelled:",km)
        print("vehicle:",type)
        print("hours:",hour)
        print("total fare:",fare)

except:
    print("Invalid Input")