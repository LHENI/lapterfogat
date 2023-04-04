/*
* File: Volume.java
* Author: Laczkó Henrietta
* Copyright: 2023, Laczkó Henrietta
* Group: Szoft I-I-N
* Date: 2023-03-04
* Github: https://github.com/LHENI/lapterfogat.git
* Licenc: GNU GPL
*/

public class Volume {
    public double calcVolume(double diagonal){
        double volume = (Math.pow(diagonal, 3))/(Math.sqrt(8));
        return volume;
    }
}
