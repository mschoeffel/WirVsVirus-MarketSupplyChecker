import Vue from 'vue';
import Vuetify from 'vuetify/lib';

Vue.use(Vuetify);

export default new Vuetify({
    theme: {
        themes: {
            light: {
                primary: '#009688',
                secondary: '#00bcd4',
                accent: '#673ab7',
                error: '#f44336',
                warning: '#ff9800',
                info: '#607d8b',
                success: '#8bc34a'
            },
        },
    },
});
