const state = {
    id: 1
};

const getters = {
    get_id: state => state.id
};

const mutations = {
    UPDATE_ID(state, ids) {
        state.id = ids;
    }
};

const actions = {
    update_id({ commit, state }, data) {
        commit("UPDATE_ID", data);
    }
};

export default {
    strict: process.env.NODE_ENV !== "production",
    state: {
        ...state
    },
    getters,
    mutations,
    actions
};