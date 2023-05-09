<template>
  <div class="regist">
    <h1 class="underline">SSAFY 게시글 수정</h1>
    <div class="regist_form">
      <label for="title">제목</label>
      <input type="text" id="title" v-model="article.title" /><br />
      <label for="content">내용</label>
      <br />
      <textarea
        id="content"
        v-model="article.content"
        cols="35"
        rows="5"
      ></textarea
      ><br />
      <button @click="modifyArticle">수정</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "BoardModify",
  data() {
    return {
      article: {},
    };
  },
  props: {
    input: { type: Object },
  },
  methods: {
    // 입력값 체크하기 - 체크가 성공하면 registArticle 호출
    checkValue() {},
    async modifyArticle() {
      // 비동기
      // TODO : 글번호에 해당하는 글정보 등록.
      await axios.put("http://localhost/board/modify", this.article);
      window.location.reload();
      console.log("글작성 하러가자!!!!");
    },

    moveList() {
      console.log("글목록 보러가자!!!");
    },
  },
  watch: {
    input: function () {
      this.article = this.input;
    },
  },
};
</script>

<style></style>
