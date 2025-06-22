function Log() {
    const isLoggedIn = false;
    const element = <p> {isLoggedIn ? "Welcome back" : "sign up please"} </p>

    return element;
}

export default Log;
