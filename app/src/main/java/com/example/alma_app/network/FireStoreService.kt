package com.example.alma_app.network

import com.example.alma_app.model.Sales
import com.example.alma_app.model.Sport
import com.example.alma_app.model.User
import com.google.firebase.firestore.FirebaseFirestore

const val SPORT_COLLECTION_NAME = "Sport"
const val SALES_COLLECTION_NAME = "Sales"
const val USER_COLLECTION_NAME = "User"

class FireStoreService {
    val firebaseFirestore = FirebaseFirestore.getInstance()

    fun getSport(callback: Callback<List<Sport>>){
        firebaseFirestore.collection(SPORT_COLLECTION_NAME)
            .get()
            .addOnSuccessListener {
                result-> for (doc in result){
                    val list = result.toObjects(Sport::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }

    fun getSales(callback: Callback<List<Sales>>){
        firebaseFirestore.collection(SALES_COLLECTION_NAME)
            .get()
            .addOnSuccessListener {
                result-> for (doc in result){
                    val list = result.toObjects(Sales::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }

    fun getUser(callback: Callback<List<User>>){
        firebaseFirestore.collection(USER_COLLECTION_NAME)
            .get()
            .addOnSuccessListener {
                result-> for (doc in result){
                    val list = result.toObjects(User::class.java)
                    callback.onSuccess(list)
                    break
                }
            }
    }
}