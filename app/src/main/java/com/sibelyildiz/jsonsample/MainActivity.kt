package com.sibelyildiz.jsonsample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.GsonBuilder
import com.sibelyildiz.jsonsample.data.LicenseModel
import com.sibelyildiz.jsonsample.mock.MockData


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val licenseModel: LicenseModel = MockData.getLicenseModel()
        Log.e("Sapmple", licenseModel.toString())


        //JACKSON
        //Seriliazatiom
        val objectMapper = ObjectMapper()
        val objectToJson = objectMapper.writeValueAsString(licenseModel)
        Log.e("Sample Json", objectToJson)

        //De-seriliazation
        val jsonToObject: LicenseModel =
            objectMapper.readValue<LicenseModel>(objectToJson, LicenseModel::class.java)
        Log.e("Sample Json", jsonToObject.key)

        //GSON
        //seriliazation
        val gson = GsonBuilder().create()
        val objectToGson = gson.toJson(licenseModel)
        Log.e("Sample Gson", objectToGson)

        //De-seriliazation
        val gsonToObject: LicenseModel = gson.fromJson(objectToGson, LicenseModel::class.java)
        Log.e("Sample Gson", gsonToObject.key)


    }
}