/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.RepositoryInterface;

import Model.DataAccess.IResponse;
import Model.Request.RequestAddFlight;

public interface IAddFlights {
    IResponse add(RequestAddFlight r);
}
