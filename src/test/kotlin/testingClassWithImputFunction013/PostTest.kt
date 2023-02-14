package testingClassWithImputFunction013

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
internal class PostTest {

    lateinit var post: Post

    @BeforeEach  //means it will invoke this function once before every function that has Test
    fun setup(){
        post=Post("hello this is test post",0)

    }

    @Test
    fun should_HaveOneLike_When_ClickLikeOnce() {
        // given

        //when
        post.onClickLike()
        // then
        assertEquals(1,post.likeCount)
    }

    @Test
    fun should_HaveTwoLike_When_ClickLikeTwice() {
        // given

        //when
        post.onClickLike()
        post.onClickLike()
        // then
        assertEquals(2,post.likeCount)
        //here the actual will be 3 , the test is wrong
        // we have to test every function indevidually (unit test) so we won't have side effect
        // by using BeforeEach

    }

}

//also we have @AfterEach notation used  it will invoke after executing all @Test functions