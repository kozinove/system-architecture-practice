/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Infrastructure.GettingAirportAccess;

import Model.AplicationObject.IAirport;
import java.util.Iterator;
import java.util.UUID;
import Model.Logon.IRole;

public interface IAirportAccess {
    Iterator<IAirport> all(IRole role);
    IAirport getAccess(IRole role, UUID airportID);
    IAirport getAccess(IRole role, String name);
}
