package io.github.arthurkamwt.copypasta.api

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/")
class Test {

    @GET
    fun test(): String {
        return "test!"
    }
}
