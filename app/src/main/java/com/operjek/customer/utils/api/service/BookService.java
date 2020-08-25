package com.operjek.customer.utils.api.service;

import com.operjek.customer.json.CheckStatusTransaksiRequest;
import com.operjek.customer.json.CheckStatusTransaksiResponse;
import com.operjek.customer.json.DetailRequestJson;
import com.operjek.customer.json.DetailTransResponseJson;
import com.operjek.customer.json.GetNearRideCarRequestJson;
import com.operjek.customer.json.GetNearRideCarResponseJson;
import com.operjek.customer.json.ItemRequestJson;
import com.operjek.customer.json.LokasiDriverRequest;
import com.operjek.customer.json.LokasiDriverResponse;
import com.operjek.customer.json.RideCarRequestJson;
import com.operjek.customer.json.RideCarResponseJson;
import com.operjek.customer.json.SendRequestJson;
import com.operjek.customer.json.SendResponseJson;
import com.operjek.customer.json.fcm.CancelBookRequestJson;
import com.operjek.customer.json.fcm.CancelBookResponseJson;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/17/2019.
 */

public interface BookService {

    @POST("pelanggan/list_ride")
    Call<GetNearRideCarResponseJson> getNearRide(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/list_car")
    Call<GetNearRideCarResponseJson> getNearCar(@Body GetNearRideCarRequestJson param);

    @POST("pelanggan/request_transaksi")
    Call<RideCarResponseJson> requestTransaksi(@Body RideCarRequestJson param);

    @POST("pelanggan/inserttransaksimerchant")
    Call<RideCarResponseJson> requestTransaksiMerchant(@Body ItemRequestJson param);

    @POST("pelanggan/request_transaksi_send")
    Call<SendResponseJson> requestTransaksisend(@Body SendRequestJson param);

    @POST("pelanggan/check_status_transaksi")
    Call<CheckStatusTransaksiResponse> checkStatusTransaksi(@Body CheckStatusTransaksiRequest param);

    @POST("pelanggan/user_cancel")
    Call<CancelBookResponseJson> cancelOrder(@Body CancelBookRequestJson param);

    @POST("pelanggan/liat_lokasi_driver")
    Call<LokasiDriverResponse> liatLokasiDriver(@Body LokasiDriverRequest param);

    @POST("pelanggan/detail_transaksi")
    Call<DetailTransResponseJson> detailtrans(@Body DetailRequestJson param);


}
