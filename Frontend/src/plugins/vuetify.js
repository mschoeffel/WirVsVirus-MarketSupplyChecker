import Vue from 'vue';
import Vuetify from 'vuetify/lib';

Vue.use(Vuetify);

export default new Vuetify({
    theme: {
        themes: {
            light: {
                primary: '#00bcd4',
                secondary: '#009688',
                accent: '#ffeb3b',
                error: '#f44336',
                warning: '#ff9800',
                info: '#607d8b',
                success: '#4caf50'
            },
        },
    },
});
