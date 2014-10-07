/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Infrastructure.IInfrastructureHandler;

import Infrastructure.Repository.IInfrastructureHandler;
import Model.DataAccess.IResponse;
import Model.Request.RequestAllFlights;

/**
 *
 * @author Evgeniy
 */
public interface IGetAllFlights  extends IInfrastructureHandler{
    IResponse get(RequestAllFlights r);
}