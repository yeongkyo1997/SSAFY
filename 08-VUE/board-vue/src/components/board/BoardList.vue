<template>
  <div>
    <h1 class="underline">도서 목록</h1>
    <div style="text-align: right">
      <button @click="movePage">도서 등록</button>
    </div>
    <div v-if="articles.length">
      <table id="article-list">
        <colgroup>
          <col style="width: 5%" />
          <col style="width: 65%" />
          <col style="width: 10%" />
          <col style="width: 5%" />
          <col style="width: 15%" />
        </colgroup>
        <thead>
          <tr>
            <th>번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>조회수</th>
            <th>작성일</th>
          </tr>
        </thead>
        <tbody>
          <board-list-item
            v-for="article in articles"
            :key="article.articleno"
            :article="article"
          ></board-list-item>
        </tbody>
      </table>
    </div>
    <div class="text-center" v-else>게시글이 없습니다.</div>
  </div>
</template>

<script>
import BoardListItem from "@/components/board/BoardListItem";
import http from "@/util/http-common";
// import axios from "axios";

export default {
  name: "BoardList",
  components: {
    BoardListItem,
  },
  data() {
    return {
      articles: [],
    };
  },
  created() {
    // 비동기
    // TODO : 글목록 얻기.

    http.get("/board").then((response) => {
      this.articles = response.data;
    });

    // this.articles = [
    //   {
    //     articleno: 10,
    //     userid: "안효인",
    //     subject: "안녕하세요",
    //     hit: 10,
    //     regtime: "2022-11-08 17:03:15",
    //   },
    //   {
    //     articleno: 9,
    //     userid: "김싸피",
    //     subject: "안녕하세요2",
    //     hit: 102,
    //     regtime: "2022-11-08 14:13:15",
    //   },
    //   {
    //     articleno: 8,
    //     userid: "박싸피",
    //     subject: "안녕하세요7",
    //     hit: 24,
    //     regtime: "2022-11-07 11:03:15",
    //   },
    // ];
  },
  methods: {
    movePage() {
      this.$router.push({ name: "boardwrite" });
    },
  },
};
</script>

<style></style>
