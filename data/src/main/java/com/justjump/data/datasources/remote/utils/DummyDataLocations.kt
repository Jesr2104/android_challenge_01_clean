package com.justjump.data.datasources.remote.utils

import com.justjump.domain.tweets.GeoLocationDataModel
import kotlin.random.Random

class DummyDataLocations {
    private var listLocation = arrayListOf<GeoLocationDataModel>()

    init {
        listLocation.add(GeoLocationDataModel(51.50903097096246, -0.07574882243686332))
        listLocation.add(GeoLocationDataModel(51.50198632663553, -0.14212054469515498))
        listLocation.add(GeoLocationDataModel(51.506210002684924, -0.18755370925856424))
        listLocation.add(GeoLocationDataModel(51.52071443036464, -0.1263369455191087))
        listLocation.add(GeoLocationDataModel(51.51010387730352, -0.13421765431478827))
        listLocation.add(GeoLocationDataModel(51.516292614661424, -0.130025211570966))
        listLocation.add(GeoLocationDataModel(51.51525911620366, -0.14187341931705988))
        listLocation.add(GeoLocationDataModel(51.51510315194337, -0.14223982082745046))
        listLocation.add(GeoLocationDataModel(51.53103501448668, -0.12211740890361045))
        listLocation.add(GeoLocationDataModel(51.53484588878669, -0.10339081699553652))
        listLocation.add(GeoLocationDataModel(51.54606013350019, -0.10408697283804062))
        listLocation.add(GeoLocationDataModel(51.54551896896752, -0.12009855701153396))
        listLocation.add(GeoLocationDataModel(51.54411191098449, -0.13436975158734055))
        listLocation.add(GeoLocationDataModel(51.546839399225455, -0.1479447903313735))
        listLocation.add(GeoLocationDataModel(51.56529976171821, -0.13489186846930148))
        listLocation.add(GeoLocationDataModel(51.531280175515754, -0.15638669314702855))
        listLocation.add(GeoLocationDataModel(51.507100696162894, -0.1654332994779091))
        listLocation.add(GeoLocationDataModel(51.47468232569574, -0.23395060966490802))
        listLocation.add(GeoLocationDataModel(51.441500724538884, -0.2752269601905307))
        listLocation.add(GeoLocationDataModel(51.406592833258586, -0.32089257804983506))
        listLocation.add(GeoLocationDataModel(51.49335221033563, 0.008848488338960979))
        listLocation.add(GeoLocationDataModel(51.54723082721562, -0.008410214075195675))
        listLocation.add(GeoLocationDataModel(51.50942149936923, -0.07626494021910324))
        listLocation.add(GeoLocationDataModel(51.478327727316, 0.0016402096311493159))
        listLocation.add(GeoLocationDataModel(51.48313853733619, -0.0818730501313403))
        listLocation.add(GeoLocationDataModel(51.49575257658622, -0.10059760854246859))
        listLocation.add(GeoLocationDataModel(51.496096312853034, -0.10931536036067874))
        listLocation.add(GeoLocationDataModel(51.51026007919247, -0.10408333171364349))
        listLocation.add(GeoLocationDataModel(51.516347967620646, -0.1165391398858095))
        listLocation.add(GeoLocationDataModel(51.51949872904833, -0.127172146857386))
        listLocation.add(GeoLocationDataModel(51.53948150929009, -0.16046014141811102))

    }

    fun geoLocation(): GeoLocationDataModel =  listLocation[Random.nextInt(0, 29)]

}