
オブジェクト指向でQiitaのサービス作成の場合を考える



親クラス

postクラス
 title, body

->
子クラス

postBlogクラス
 tag
prBlogクラス
 twitter button, 

================

post p = new postBlog

post p = new prBlog

f1(postBlog)
f1(prBlog)
function f1(prBlog p) {
}

function f1(post p) {
    
}

fucntion save() {
    database.save()
    // mysqlに保存
}



