const app = new Vue({
    el: '#app',
    methods: {
        getData: function() {
            var self = this;
            axios.get("/users")
                .then(function (response) {
                    self.users = response.data.data;
                })
                .catch(function (errors) {
                    console.log('Error al optener la informacion');
                    alert('Error al optener la informacion');
                });
        },
        store: function () {
            var self = this;
            axios.post("/users", self.form)
                .then(function (response) {
                    self.users.add(response.data.data);
                    self.form = {
                        name: "",
                        lastName: "",
                        age: 0
                    };
                    alert("Datos agregados a la table :)");
                })
                .catch(function (errors) {
                    alert("Error inesperado");
                });
        }
    },
    data: function() {
        return {
            message: "Hola :3",
            formMessage: "Agregar desde formulario",
            users: [],
            form: {
                name: "",
                lastName: "",
                age: 0
            }
        }
    }
});