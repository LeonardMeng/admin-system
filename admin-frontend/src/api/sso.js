import request from "../utils/request";

export function register(data) {
    return request({
        url: "/sso/register",
        method: "post",
        data
    });
}

export function login(data) {
  return request({
    url: "/sso/login",
    method: "post",
    data
  });
}

export function logout() {
  return request({
    url: "/sso/logout",
    method: "post"
  });
}

export function generateToken() {
  return request({
    url: "/sso/generateToken",
    method: "post"
  });
}
