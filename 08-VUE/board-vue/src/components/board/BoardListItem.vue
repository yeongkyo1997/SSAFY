<template>
  <tr>
    <td>{{ article.noticeId }}</td>
    <td @click="select">{{ article.title }}</td>
    <td>{{ article.content }}</td>
    <td>{{ article.createDate }}</td>
    <td>{{ article.views }}</td>
    <td><button @click="del">삭제</button></td>
  </tr>
</template>

<script>
import axios from "axios";
export default {
  name: "BoardListItem",
  props: {
    article: {
      type: Object,
      required: true,
    },
  },
  methods: {
    select() {
      console.log("hi");
      this.$emit("select", this.article);
    },
    del() {
      console.log(this.article);
      axios.delete(
        `http://localhost/board/delete?noticeId=${this.article.noticeId}`
      );
      window.location.reload();
    },
  },
};
</script>

<style></style>
