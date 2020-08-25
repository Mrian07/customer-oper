package com.operjek.customer.utils.api.service;

import com.operjek.customer.json.AllMerchantByNearResponseJson;
import com.operjek.customer.json.AllMerchantbyCatRequestJson;
import com.operjek.customer.json.AllTransResponseJson;
import com.operjek.customer.json.BankResponseJson;
import com.operjek.customer.json.BeritaDetailRequestJson;
import com.operjek.customer.json.BeritaDetailResponseJson;
import com.operjek.customer.json.ChangePassRequestJson;
import com.operjek.customer.json.DetailRequestJson;
import com.operjek.customer.json.EditprofileRequestJson;
import com.operjek.customer.json.GetAllMerchantbyCatRequestJson;
import com.operjek.customer.json.GetFiturResponseJson;
import com.operjek.customer.json.GetHomeRequestJson;
import com.operjek.customer.json.GetHomeResponseJson;
import com.operjek.customer.json.GetMerchantbyCatRequestJson;
import com.operjek.customer.json.LoginRequestJson;
import com.operjek.customer.json.LoginResponseJson;
import com.operjek.customer.json.MerchantByCatResponseJson;
import com.operjek.customer.json.MerchantByIdResponseJson;
import com.operjek.customer.json.MerchantByNearResponseJson;
import com.operjek.customer.json.MerchantbyIdRequestJson;
import com.operjek.customer.json.PrivacyRequestJson;
import com.operjek.customer.json.PrivacyResponseJson;
import com.operjek.customer.json.RateRequestJson;
import com.operjek.customer.json.RateResponseJson;
import com.operjek.customer.json.RegisterRequestJson;
import com.operjek.customer.json.RegisterResponseJson;
import com.operjek.customer.json.ResponseJson;
import com.operjek.customer.json.SearchMerchantbyCatRequestJson;
import com.operjek.customer.json.TopupRequestJson;
import com.operjek.customer.json.TopupResponseJson;
import com.operjek.customer.json.WalletRequestJson;
import com.operjek.customer.json.WalletResponseJson;
import com.operjek.customer.json.WithdrawRequestJson;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Ourdevelops Team on 10/13/2019.
 */

public interface UserService {

    @POST("pelanggan/login")
    Call<LoginResponseJson> login(@Body LoginRequestJson param);

    @POST("pelanggan/list_bank")
    Call<BankResponseJson> listbank(@Body WithdrawRequestJson param);

    @POST("pelanggan/changepass")
    Call<LoginResponseJson> changepass(@Body ChangePassRequestJson param);

    @POST("pelanggan/register_user")
    Call<RegisterResponseJson> register(@Body RegisterRequestJson param);

    @GET("pelanggan/detail_fitur")
    Call<GetFiturResponseJson> getFitur();

    @POST("pelanggan/forgot")
    Call<LoginResponseJson> forgot(@Body LoginRequestJson param);

    @POST("pelanggan/privacy")
    Call<PrivacyResponseJson> privacy(@Body PrivacyRequestJson param);

    @POST("pelanggan/home")
    Call<GetHomeResponseJson> home(@Body GetHomeRequestJson param);

    @POST("pelanggan/topupstripe")
    Call<TopupResponseJson> topup(@Body TopupRequestJson param);

    @POST("pelanggan/withdraw")
    Call<ResponseJson> withdraw(@Body WithdrawRequestJson param);

    @POST("pelanggan/topuppaypal")
    Call<ResponseJson> topuppaypal(@Body WithdrawRequestJson param);

    @POST("pelanggan/rate_driver")
    Call<RateResponseJson> rateDriver(@Body RateRequestJson param);

    @POST("pelanggan/edit_profile")
    Call<RegisterResponseJson> editProfile(@Body EditprofileRequestJson param);

    @POST("pelanggan/wallet")
    Call<WalletResponseJson> wallet(@Body WalletRequestJson param);

    @POST("pelanggan/history_progress")
    Call<AllTransResponseJson> history(@Body DetailRequestJson param);

    @POST("pelanggan/detail_berita")
    Call<BeritaDetailResponseJson> beritadetail(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/all_berita")
    Call<BeritaDetailResponseJson> allberita(@Body BeritaDetailRequestJson param);

    @POST("pelanggan/merchantbykategoripromo")
    Call<MerchantByCatResponseJson> getmerchanbycat(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbykategori")
    Call<MerchantByNearResponseJson> getmerchanbynear(@Body GetMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchantbykategori")
    Call<AllMerchantByNearResponseJson> getallmerchanbynear(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/itembykategori")
    Call<MerchantByIdResponseJson> getitembycat(@Body GetAllMerchantbyCatRequestJson param);

    @POST("pelanggan/searchmerchant")
    Call<AllMerchantByNearResponseJson> searchmerchant(@Body SearchMerchantbyCatRequestJson param);

    @POST("pelanggan/allmerchant")
    Call<AllMerchantByNearResponseJson> allmerchant(@Body AllMerchantbyCatRequestJson param);

    @POST("pelanggan/merchantbyid")
    Call<MerchantByIdResponseJson> merchantbyid(@Body MerchantbyIdRequestJson param);


}
