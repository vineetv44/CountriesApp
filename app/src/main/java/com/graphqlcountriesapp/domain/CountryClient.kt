package com.graphqlcountriesapp.domain


//It will define the functions that we will use to interact with the our API
interface CountryClient {
    suspend fun getCountries() : List<SimpleCountry>
    suspend fun getCountry(code: String) : DetailedCountry?

}