import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   getters: {
//     countMsg(state) {
//       let msg = "10번 보다 ";
//       if (state.count > 10) msg += "많이 ";
//       else msg += "적게 ";

//       return msg + " 호출되었습니다.(" + state.count + ")";
//     },
//   },
// });

// step3, step4
// export default new Vuex.Store({
//   state: {
//     count: 0,
//   },
//   mutations: {
//     ADD_ONE(state) {
//       state.count++;
//     },
//     ADD_COUNT(state, payload) {
//       state.count += payload;
//     },
//     ADD_OBJ_COUNT(state, payload) {
//       state.count += payload.num;
//     },
//   },
//   getters: {
//     countMsg(state) {
//       let msg = "10번 보다 ";
//       if (state.count > 10) msg += "많이 ";
//       else msg += "적게 ";

//       return msg + " 호출되었습니다.(" + state.count + ")";
//     },
//     msg1(state) {
//       return "msg1(getters) : " + state.count;
//     },
//     msg2(state) {
//       return "msg2(getters) : " + state.count;
//     },
//     msg3(state) {
//       return "msg3(getters) : " + state.count;
//     },
//   },
// });
export default new Vuex.Store({
  state: {
    count: 0,
  },
  mutations: {
    ADD_ONE(state) {
      state.count++;
    },
    ADD_COUNT(state, payload) {
      state.count += payload;
    },
    ADD_OBJ_COUNT(state, payload) {
      state.count += payload.num;
    },
    ADD_TEN_COUNT(state) {
      state.count += 10;
    },
  },
  getters: {
    countMsg(state) {
      let msg = "10번 보다 ";
      if (state.count > 10) msg += "많이 ";
      else msg += "적게 ";

      return msg + " 호출되었습니다.(" + state.count + ")";
    },
    msg1(state) {
      return "msg1(getters) : " + state.count;
    },
    msg2(state) {
      return "msg2(getters) : " + state.count;
    },
    msg3(state) {
      return "msg3(getters) : " + state.count;
    },
  },

  actions: {
    asyncAddOne(context) {
      context.commit("ADD_ONE");
    },
  },
});
