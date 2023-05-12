<template>
  <div class="regist">
    <h1>SSAFY 글 삭제</h1>
    <div>삭제중....</div>
  </div>
</template>

<script>
import http from "@/util/http-common";
export default {
  name: "BoardDelete",
  data() {
    return {
      articleno: Number,
    };
  },
  created() {
    // 비동기
    // TODO : 글번호에 해당하는 글을 삭제.
    this.articleno = this.$route.params.articleno;
    console.log(this.articleno + "번글 삭제!!!!!");

    http.delete(`/board/${this.articleno}`).then((response) => {
      let msg = "글삭제 시 문제 발생!!";
      if (response.data === "success") {
        msg = "글삭제 성공!!";
        alert(msg);
        this.$router.push({ name: "boardlist" });
      }
    });
  },
};
</script>

<style></style>
