<template>
  <div class="regist">
    <h1 class="underline">SSAFY 게시글 작성</h1>
    <div class="regist_form">
      <label for="userid">제목</label>
      <input type="text" id="subject" v-model="title" /><br />
      <label for="content">내용</label>
      <br />
      <textarea id="content" v-model="content" cols="35" rows="5"></textarea
      ><br />
      <button @click="registArticle">등록</button>
      <button @click="moveList">목록</button>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "BoardWrite",
  data() {
    return {
      title: "",
      content: "",
    };
  },
  methods: {
    // 입력값 체크하기 - 체크가 성공하면 registArticle 호출
    checkValue() {},
    async registArticle() {
      // 비동기
      // TODO : 글번호에 해당하는 글정보 등록.
      await axios.post("http://localhost/board/regist", {
        title: this.title,
        content: this.content,
      });
      window.location.reload();
      console.log("글작성 하러가자!!!!");
    },

    moveList() {
      console.log("글목록 보러가자!!!");
    },
  },
};
</script>

<style></style>
