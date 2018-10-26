const app = new Vue({
    el: '#app',
    methods: {
        getData: function() {
            var self = this;
            axios.get('/users')
                .then(function (response) {
                    self.users = response.data;
                })
                .catch(function (errors) {
                    console.log('Error al optener la informacion');
                    alert('Error al optener la informacion');
                });
        }
    },
    data: function() {
        return {
            message: 'Hola :3',
            users: []
        }
    }
});