/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Request;

import Model.AplicationObject.IFlight;
import Model.DataAccess.IRequest;
import Model.Logon.IRole;

public class RequestCancelFlight  extends RequestSimple implements IRequest{
    IFlight flight;
    
    public RequestCancelFlight(IRole r, IFlight flights)
    {
        super(r);
        this.flight = flights;
    }
    
    public IFlight get()
    {
        return flight;
    }
}
