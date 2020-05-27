package com.aa183.lux;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("ambil_data.php")
    Call<List<Barang>> getBarang();

    @FormUrlEncoded
    @POST("tambah_data.php")
    Call<Barang> insertBaran(
            @Field("key") String key,
            @Field("name") String name,
            @Field("harga") String harga,
            @Field("jumlah") String jumlah,
            @Field("status") int status,
            @Field("tanggal") String tanggal,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_date.php")
    Call<Barang> updateBaran(
            @Field("key") String key,
            @Field("id") int id,
            @Field("name") String name,
            @Field("harga") String harga,
            @Field("jumlah") String jumlah,
            @Field("status") int status,
            @Field("tanggal") String tanggal,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("hapus_data.php")
    Call<Barang> deleteBaran(
            @Field("key") String key,
            @Field("id") int id,
            @Field("picture") String picture);

    @FormUrlEncoded
    @POST("update_love.php")
    Call<Barang> updateLove(
            @Field("key") String key,
            @Field("id") int id,
            @Field("love") boolean love);

}

