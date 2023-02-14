package testingClassWithImputFunction013

class Post (
    var postContent :String,
    var likeCount :Int
){
    fun onClickLike(){
        likeCount++
    }

    fun onClickDisLike(){
        likeCount--
    }
}