#[no_mangle]
pub extern "C" fn add_numbers(a: i32, b: i32) -> i64 {
  println!("rust!");
  (a - b).into()
}
