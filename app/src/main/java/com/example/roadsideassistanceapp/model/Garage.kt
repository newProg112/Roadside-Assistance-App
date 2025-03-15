package com.example.roadsideassistanceapp.model

import androidx.annotation.StringRes
import com.example.roadsideassistanceapp.R

data class Garage(
    @StringRes val garageRes: Int,
    @StringRes val garageAddressRes: Int
)

object GarageRepository {
    val garages = listOf(
        Garage(
            garageRes = R.string.crown_farm_garage,
            garageAddressRes = R.string.crown_farm_garage_address
        ),
        Garage(
            garageRes = R.string.bath_lane_autos,
            garageAddressRes = R.string.bath_lane_autos_address
        ),
        Garage(
            garageRes = R.string.top_notch_repairs,
            garageAddressRes = R.string.top_notch_repairs_address
        ),
        Garage(
            garageRes = R.string.ace_motors,
            garageAddressRes = R.string.ace_motors_address
        ),
        Garage(
            garageRes = R.string.robin_hood_restore,
            garageAddressRes = R.string.robin_hood_restore_address
        ),
        Garage(
            garageRes = R.string.robin_hood_restore,
            garageAddressRes = R.string.robin_hood_restore_address
        ),
        Garage(
            garageRes = R.string.robin_hood_restore,
            garageAddressRes = R.string.robin_hood_restore_address
        ),
    )
}