import Vue from "vue";
import VueRouter from "vue-router";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "home",
    redirect: "/step00",
  },
  {
    path: "/step00",
    name: "step00",
    component: () => import("@/views/Step00View.vue"),
  },
  {
    path: "/step01",
    name: "step01",
    component: () => import("@/views/Step01View.vue"),
  },
  {
    path: "/step02",
    name: "step02",
    component: () => import("@/views/Step02View.vue"),
  },
  {
    path: "/step03",
    name: "step03",
    component: () => import("@/views/Step03View.vue"),
  },
  {
    path: "/step04",
    name: "step04",
    component: () => import("@/views/Step04View.vue"),
  },
  {
    path: "/step05",
    name: "step05",
    component: () => import("@/views/Step05View.vue"),
  },
  {
    path: "/step06",
    name: "step06",
    component: () => import("@/views/Step06View.vue"),
  },
  {
    path: "/step07",
    name: "step07",
    component: () => import("@/views/Step07View.vue"),
  },
];

const router = new VueRouter({
  mode: "history",
  base: process.env.BASE_URL,
  routes,
});

export default router;
