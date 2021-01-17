package id.lusia0799.githubuser.api

import id.lusia0799.githubuser.data.model.DetailUserResponse
import id.lusia0799.githubuser.data.model.User
import id.lusia0799.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 28504b653398e4120118ea89aaa84c995a1272f2")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 28504b653398e4120118ea89aaa84c995a1272f2")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 28504b653398e4120118ea89aaa84c995a1272f2")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 28504b653398e4120118ea89aaa84c995a1272f2")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}